/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs518.a2.budgaga.core;

import cs518.a2.budgaga.util.HelperClass;

/**
 *
 * @author budgaga
 */
public class BibtexEntry {
    private String key;
    private String author;
    private String title;
    private String journal;
    private String volume;
    private String number;
    private String pages;
    private int    month;
    private int    year;

    public BibtexEntry(String entryText){
       init(entryText);
    }
   
    private void init(String entryText){
        try{
            setAuthor(HelperClass.getPartValue(entryText, "author"));
            setTitle(HelperClass.getPartValue(entryText, "title"));
            setJournal(HelperClass.getPartValue(entryText, "journal"));
            setVolume(HelperClass.getPartValue(entryText, "volume"));
            setNumber(HelperClass.getPartValue(entryText, "number"));
            setPages(HelperClass.getPartValue(entryText, "pages"));
            setMonth(HelperClass.getMonthPos(HelperClass.getPartValue(entryText, "month")));
            setYear(Integer.parseInt(HelperClass.getPartValue(entryText, "year")));
            setKey(HelperClass.getFirstPartValue(entryText));
        }catch(NumberFormatException e){
            throw new UnsupportedOperationException("Not supported file format!");
        }
    }

    public void setKey(String key) {
        this.key = key;
    }
   
    public String getKey() {
        return this.key;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }
    public String getJournal() {
        return this.journal;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return this.month;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setYear(int year) {
        this.year = year;
    }  
    public int getYear() {
        return this.year;
    }

    private String authorToString(){ 
        return "author\t= "+ author; 
    }
    
    private String titleToString(){
        return "title\t= "+ title; 
    }
    
    private String journalToString(){
           return "journal\t= "+ journal; 
    }
    private String volumeToString(){
        return "volume\t= " + volume;
    }
    private String numberToString(){
        return "number\t= " + number;
    }
    private String pagesToString(){
        return "pages\t= " + pages;
    }
    private String monthToString(){
        return "month\t= " + HelperClass.getMonthName(month);
    }
    private String yearToString(){
        return "year\t= " + year;
    }
    
    @Override
    public String toString(){
       // System.out.println(getFirstAuthorLastname());
        return "{"+key+",\n"+authorToString()+ ",\n"+titleToString()+",\n"+journalToString()+",\n"+
                volumeToString()+",\n"+numberToString()+",\n"+
                pagesToString()+",\n"+monthToString()+",\n"+yearToString()+"}";
    }
 }
