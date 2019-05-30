public  class Country{
    private Integer code;
    private String name;
    public Country(Integer code,String name){
        this.code=code;
        this.name=name;
    }
    public String toString(){
        return "CODE : "+code+" NAME : "+name;
    }
    public Integer getCode(){
        return code;
    }
    public String getString(){
        return name;
    }

}