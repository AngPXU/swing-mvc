/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaotactaptinthumuc;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    
    //Thao tac 1: Lien ket tat ca cac thu muc va tap tin trong thu muc hien tai
    public File[] getDirectoryContent(String folder){
        File directory = new File(folder);
        if(directory.isFile())
            return null;
        File[] results = directory.listFiles();
        return results;
    }
    // Thao tac 2: xuat ket qua 
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < content.length; i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    //Thao tac 3: Loc cac thu muc
    public File[] getSubDirectories(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for(int i = 0; i < content.length; i++){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua); 
    }
    
    //Thao tac 4: Loc ra cac tap tin
    public File[] getFiles(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for(int i = 0; i < content.length; i++){
            if(content[i].isFile()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
}