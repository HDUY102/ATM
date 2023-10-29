
package Cay_ATM;

import Enum_ATM.TransactionTypeEnum;
import java.time.LocalDateTime;

public class TransactionInfo {
    private TransactionTypeEnum Type;
    private LocalDateTime ngayGD;
    private double soTienGD;
    private long stkThucHien;
    private long stkNhan;
    private String noiDung;
    private long idTransaction;
    
    public TransactionInfo() {
    }

    public TransactionInfo(TransactionTypeEnum Type, LocalDateTime ngayGD, double soTienGD, long stkThucHien, long stkNhan, String noiDung, long idTransaction) {
        this.Type = Type;
        this.ngayGD = ngayGD;
        this.soTienGD = soTienGD;
        this.stkThucHien = stkThucHien;
        this.stkNhan = stkNhan;
        this.noiDung = noiDung;
        this.idTransaction = idTransaction;
    }

    

    public TransactionTypeEnum getType() {
        return Type;
    }

    public void setType(TransactionTypeEnum Type) {
        this.Type = Type;
    }

    public LocalDateTime getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(LocalDateTime ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getSoTienGD() {
        return soTienGD;
    }

    public void setSoTienGD(double soTienGD) {
        this.soTienGD = soTienGD;
    }

    public long getStkThucHien() {
        return stkThucHien;
    }

    public void setStkThucHien(long stkThucHien) {
        this.stkThucHien = stkThucHien;
    }

    public long getStkNhan() {
        return stkNhan;
    }

    public void setStkNhan(long stkNhan) {
        this.stkNhan = stkNhan;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(long idTransaction) {
        this.idTransaction = idTransaction;
    }

    
}
