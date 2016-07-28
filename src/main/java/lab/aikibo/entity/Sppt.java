package lab.aikibo.entity;

public class Sppt {
  private String nop;
  private String thn;
  private String nama;
  private long pbb;

  public Sppt(String nop, String thn, String nama, long pbb) {
    this.nop = nop;
    this.thn = thn;
    this.nama = nama;
    this.pbb = pbb;
  }

  public String getNop() {
    return nop;
  }

  public void setNop(String nop) {
    this.nop = nop;
  }

  public String getThn() {
    return thn;
  }

  public void setThn(String thn) {
    this.thn = thn;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public long getPbb() {
    return pbb;
  }

  public void setPbb(long pbb) {
    this.pbb = pbb;
  }
}
