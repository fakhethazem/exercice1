package com.company;

public class facultefactory {
    public static faculte getfaculte(String type){
        switch (type)
        {
            case "deptinfo":{
                return new deptinfo() ;          }
            case"deptchimie":{
                return new Deptchimie();
            }
            default :{
                return null;
            }
        }
    }
}
