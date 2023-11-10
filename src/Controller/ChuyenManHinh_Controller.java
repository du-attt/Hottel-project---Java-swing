
package Controller;

import Bean.DanhMuc;
import View.Checkin_Panel;
import View.Checkout_panel;
import View.DatTiec_Panel;
import View.QuanLyDichVu_Panel;
import View.QuanLyKhachHang_Panel;
import View.QuanLyNhanVien_Panel;
import View.QuanLyPhong_Panel;
import View.TaiKhoan_Panel;
import View.TrangChu_Panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


/**
 *
 * @author asus
 */
public class ChuyenManHinh_Controller {
    private JPanel Root;
    private String kindeSelected = "";
    
    private List<DanhMuc> listItem = null;

    public ChuyenManHinh_Controller(JPanel jpnRoot) {
        this.Root = jpnRoot;
    }
    
    public void setView (JPanel jpnItem, JLabel jlbItem){
        kindeSelected = "TrangChu";
        Border border = BorderFactory.createMatteBorder(0, 4, 0, 0, Color.getHSBColor(0.76666665f, 1.0f, 1.0f));
        jpnItem.setBorder(border);
        jpnItem.setBackground(Color.getHSBColor(0.7012195f, 0.8125f, 0.40980393f));
        Root.removeAll();
        Root.setLayout(new BorderLayout());
        Root.add(new TrangChu_Panel());
        Root.validate(); 
        Root.repaint();  

    }
    
    public void setEvent(List<DanhMuc> listItem){
        this.listItem = listItem;
        for(DanhMuc item: listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }  
    class LabelEvent implements MouseListener{
        
        private JPanel node;
        
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;
        private Color color;
        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "TrangChu":
                    node = new TrangChu_Panel();
                    break;
                case "QuanLiKhachHang":
                    node = new QuanLyKhachHang_Panel();
                    break;
                case "QuanLiNhanVien":
                    node = new QuanLyNhanVien_Panel();
                    break;
                case "QuanLiPhong":
                    node = new QuanLyPhong_Panel();
                    break;
                case "DatTiec":
                    node = new DatTiec_Panel();
                    break;
                case "ThongKe":
//                    node = new ThongKe_Panel();
                    break;
                case "QuanLiDichVu":
                    node = new QuanLyDichVu_Panel();
                    break;
                case "QuanLiDatPhong":
                    node = new QuanLyPhong_Panel();
                    break;
                case "CheckIn":
                    node = new Checkin_Panel();
                    break;
                case "CheckOut":
                    node = new Checkout_panel();
                    break;
                case "DangXuat":
                    node = new TaiKhoan_Panel();
                    break;
                case "ThanhFix":
                    break;
                default:
                    node = new TrangChu_Panel();
                    break;
            }
            Root.removeAll();
            Root.repaint();
            Root.revalidate();
            
            Root.setLayout(new BorderLayout());
            Root.add(node);
            Root.repaint();            
            Root.revalidate();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindeSelected = kind;
            Border border = BorderFactory.createMatteBorder(0, 4, 0, 0, Color.getHSBColor(0.76666665f, 1.0f, 1.0f));
            Color color = jlbItem.getForeground();
            for (DanhMuc item : listItem) {
                JPanel jpnItem = item.getJpn();
                if (!kindeSelected.equalsIgnoreCase(item.getKind())) {
                    jpnItem.setBorder(null); // Ẩn border trên các panel khác
                    jpnItem.setBackground(null);
                    jlbItem.setForeground(color);
                } else {
                    jpnItem.setBorder(border); // Hiển thị border trên panel được nhấn chuột
                    jlbItem.setForeground(Color.WHITE);
                }
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            Border border = BorderFactory.createMatteBorder(0, 4, 0, 0, Color.getHSBColor(0.76666665f, 1.0f, 1.0f));
            jpnItem.setBorder(border);
            jpnItem.setBackground(Color.getHSBColor(0.7012195f, 0.8125f, 0.40980393f));
            jlbItem.setForeground(Color.WHITE);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindeSelected.equalsIgnoreCase(kind)){
                jpnItem.setBorder(null);
                jpnItem.setBackground(null);
                Color color = jlbItem.getForeground();
                jlbItem.setForeground(color);
            }
        }
    
    }
    private void setChangeBackground(String kind){
        for(DanhMuc item : listItem){
            Border border = BorderFactory.createMatteBorder(0, 4, 0, 0, Color.getHSBColor(0.76666665f, 1.0f, 1.0f));
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBorder(null);
            } else {
                item.getJpn().setBorder(border);
//                item.getJlb().setForeground(Color.RED);
            }
        } 
    }
}
