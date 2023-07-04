public abstract class Peminjam implements UserLogin {
    private boolean isLogin;

    @Override
    public void doLogin(){
        System.out.println("Peminajam Berhasil Login");
        isLogin = true;
    }

    @Override
    public void doLogout(){
        System.out.println("Peminjam Berhasil Logout");
        isLogin = false;
    }

    @Override
    public boolean isLogin(){
        return isLogin;
    }

    public abstract void setKodePeminjam(String kodePeminjam);
    public abstract String getKodePeminjam();
    public abstract void setNamaPeminjam(String setNamaPeminjam);
    public abstract String getNamaPeminjam();

}
