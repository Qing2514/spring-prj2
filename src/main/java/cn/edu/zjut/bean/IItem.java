package cn.edu.zjut.bean;

public interface IItem
{
    void setItemID(String itemID);
    String getItemID();
    void setTitle(String title);
    String getTitle();
    void setDescription(String description);
    String getDescription();
    void setCost(double cost);
    double getCost();
}
