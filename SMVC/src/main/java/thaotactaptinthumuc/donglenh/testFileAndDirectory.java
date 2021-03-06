/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaotactaptinthumuc.donglenh;

import java.io.File;
import java.util.ArrayList;
import thaotactaptinthumuc.FileAndDirectoryOperations;

/**
 *
 * @author ASUS
 */
public class testFileAndDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
        File[] content = fo.getDirectoryContent("C:\\Users\\ASUS\\OneDrive\\Documents\\WPS\\Word");
    //    System.out.println(fo.displayContent(content));
        File[] thumuc = fo.getSubDirectories(content);
        System.out.println("Danh sach cac thu muc con la: ");
        System.out.println(fo.displayContent(thumuc));
        File[] taptin = fo.getFiles(content);
        System.out.println("Danh sach cac tap tin");
        System.out.println(fo.displayContent(taptin));
    }
}
