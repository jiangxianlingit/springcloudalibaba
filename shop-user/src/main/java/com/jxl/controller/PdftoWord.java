package com.jxl.controller;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.*;
import java.util.logging.Logger;

/**
 * pdf转化器
 *
 * @author jiangxinlin
 * @create 2021-12-29-17:11
 */
public class PdftoWord {

    public static void pdfToWord() throws Exception {
        String pdfFile = "E:\\springcloud\\笔记资料\\笔记\\springcloud alibaba.pdf";
        PDDocument doc = PDDocument.load(new File(pdfFile));
        int pagenumber = doc.getNumberOfPages();//获取总页数
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(pdfFile.substring(0, pdfFile.indexOf(".")) + ".doc");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Writer writer = null;
        try {
            writer = new OutputStreamWriter(fos, "UTF-8");//文件按字节读取，然后按照UTF-8的格式编码显示
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        PDFTextStripper stripper = new PDFTextStripper();//生成PDF文档内容剥离器
        stripper.setSortByPosition(true);//排序
        stripper.setStartPage(1);//设置转换的开始页
        stripper.setEndPage(pagenumber);//设置转换的结束页
        try {
            stripper.writeText(doc, writer);
            writer.close();
            doc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            PdftoWord.pdfToWord();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

