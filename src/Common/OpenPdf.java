/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import dao.PharmacyUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author CODE
 */
public class OpenPdf {
    public static void openById(String id){
        try{
            if((new File(PharmacyUtils.billPath+id+".Pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rund1132 url.dil,FileProtocolHandler "+PharmacyUtils.billPath+""+id+".Pdf");
            }else{
                JOptionPane.showMessageDialog(null,"File does not Exist");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
