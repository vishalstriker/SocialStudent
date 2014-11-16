/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.web.servicebean;

import com.techdhoom.socialstudent.core.UsermainCore;
import com.techdhoom.socialstudent.core.impl.UsermainCoreImpl;
import com.techdhoom.socialstudent.model.Usermain;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author krunal
 */
@ManagedBean
//@ViewScoped
public class ReadfileServiceBean {
    @ManagedProperty(value="#{usermainCore}")
    public UsermainCore usermainCore;
    
    public ReadfileServiceBean() {
    }

    public ReadfileServiceBean(UsermainCore usermainCore) {
        this.usermainCore = usermainCore;
    }

    public UsermainCore getUsermainCore() {
        return usermainCore;
    }

    public void setUsermainCore(UsermainCore usermainCore) {
        this.usermainCore = usermainCore;
    }
    
    public void readfile() throws IOException{
    String filename = "C:\\userinfo.xlsx";
           List sheetData = new ArrayList();

        FileInputStream fis = null;
        try {
                      fis = new FileInputStream(filename);
 
           
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
           
            XSSFSheet sheet = workbook.getSheetAt(0);
 
           
            Iterator rows = sheet.rowIterator();
         //   for(int j=0;j<sheet.getLastRowNum()+1;j++)
            
            while (rows.hasNext()) {
                XSSFRow row = (XSSFRow) rows.next();
                //int k = row.getPhysicalNumberOfCells();
                //System.out.println(k);
                Iterator cells = row.cellIterator();
                List data = new ArrayList();
                while (cells.hasNext()) {
                    XSSFCell cell = (XSSFCell) cells.next();
                
                    if(cell.getCellType()==cell.CELL_TYPE_BLANK)
                    {
                          //data.add(cell);
                        System.out.println("complete the data");
                        break;
                    }
                    else
                    {
                        //System.out.println("complete the dta");
                        //break;
                        data.add(cell);
                    }
                
                }
 
                sheetData.add(data);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
            }
        }
        
     // showExcelData(sheetData);
    showExcelData(sheetData);
    }
    private  void showExcelData(List sheetData) {
        //
        // Iterates the data and print it out to the console.
        //
         Usermain usermain=new Usermain();
        for (int i = 0; i < sheetData.size(); i++) {
            List list = (List) sheetData.get(i);
           System.out.println(list);
            Object[] objects = list.toArray();
//            for(int j=0;j<objects.length;j++){
//            System.out.println(objects[j]);
//            }
//            for (int j = 0; j < list.size(); j++) {
//                XSSFCell cell = (XSSFCell) list.get(j);
              //  Usermain usermain=new Usermain();
               
                usermain.setEnrollNo((int)Double.parseDouble(String.valueOf(objects[0])));
                //System.out.println(usermain.getEnrollNo());
                usermain.setUsername(objects[1].toString());
                //System.out.println(usermain.getUsername());
                usermain.setUserlastname(objects[2].toString());
                usermain.setBranch(objects[3].toString());
                usermain.setYear((int)Double.parseDouble(String.valueOf(objects[4])));
               //System.out.println(usermain.getYear());
               usermain.setEmailId(objects[5].toString());
               //System.out.println(usermain.getEmailId());
               usermain.setPassword(objects[1].toString()+"123");
           System.out.println(usermain.getBranch());
           // usermain.setUserId(1l);
//                UsermainCore usermainCore = new  UsermainCoreImpl();
//                usermainCore.createUser(usermain);
               usermainCore.createUser(usermain);
            }
  
        
        }
}
