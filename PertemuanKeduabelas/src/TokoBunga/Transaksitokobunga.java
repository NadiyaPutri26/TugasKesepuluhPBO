package TokoBunga;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "transaksitokobunga")
@NamedQueries({
    @NamedQuery(name = "Transaksitokobunga.findAll", query = "SELECT t FROM Transaksitokobunga t"),
    @NamedQuery(name = "Transaksitokobunga.findByIdtransaksi", query = "SELECT t FROM Transaksitokobunga t WHERE t.idtransaksi = :idtransaksi"),
    @NamedQuery(name = "Transaksitokobunga.findByNamapelanggan", query = "SELECT t FROM Transaksitokobunga t WHERE t.namapelanggan = :namapelanggan"),
    @NamedQuery(name = "Transaksitokobunga.findByTanggal", query = "SELECT t FROM Transaksitokobunga t WHERE t.tanggal = :tanggal"),
    @NamedQuery(name = "Transaksitokobunga.findByJumlah", query = "SELECT t FROM Transaksitokobunga t WHERE t.jumlah = :jumlah"),
    @NamedQuery(name = "Transaksitokobunga.findByTotalharga", query = "SELECT t FROM Transaksitokobunga t WHERE t.totalharga = :totalharga")
})
public class Transaksitokobunga implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "idtransaksi")
    private String idtransaksi;

    @Column(name = "namapelanggan")
    private String namapelanggan;

    @Column(name = "tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;

    @Column(name = "jumlah")
    private Integer jumlah;

    @Column(name = "totalharga")
    private Integer totalharga;

    @JoinColumn(name = "idbunga", referencedColumnName = "idbunga")
    @ManyToOne
    private Tokobunga_1 idbunga;

    public Transaksitokobunga() {
    }

    public Transaksitokobunga(String idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public String getIdtransaksi() {
        return idtransaksi;
    }

    public void setIdtransaksi(String idtransaksi) {
        this.idtransaksi = idtransaksi;
    }

    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Integer getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(Integer totalharga) {
        this.totalharga = totalharga;
    }

    public Tokobunga_1 getIdbunga() {
        return idbunga;
    }

    public void setIdbunga(Tokobunga_1 idbunga) {
        this.idbunga = idbunga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtransaksi != null ? idtransaksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Transaksitokobunga)) {
            return false;
        }
        Transaksitokobunga other = (Transaksitokobunga) object;
        if ((this.idtransaksi == null && other.idtransaksi != null)
                || (this.idtransaksi != null && !this.idtransaksi.equals(other.idtransaksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TokoBunga.Transaksitokobunga[ idtransaksi=" + idtransaksi + " ]";
    }
}
