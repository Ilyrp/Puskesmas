package entity;

public class AdminEntity extends Orang{

    public AdminEntity(String username,String password){
        super(username,password);
    }


    public String getUsername(){
        return super.getUsername();
    }
    

    public String getPassword() {
        return super.getUsername();
    }

    public void setUsername(String username) {
        super.setUsername(username);
    }

    public void setPassword(String password) {
        super.setPassword(password);
    }
}