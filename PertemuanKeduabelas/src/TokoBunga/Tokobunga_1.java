/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoBunga;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Huawei
 */
@Entity
@Table(name = "tokobunga")
@NamedQueries({
    @NamedQuery(name = "Tokobunga_1.findAll", query = "SELECT t FROM Tokobunga_1 t"),
    @NamedQuery(name = "Tokobunga_1.findByIdbunga", query = "SELECT t FROM Tokobunga_1 t WHERE t.idbunga = :idbunga"),
    @NamedQuery(name = "Tokobunga_1.findByNamabunga", query = "SELECT t FROM Tokobunga_1 t WHERE t.namabunga = :namabunga"),
    @NamedQuery(name = "Tokobunga_1.findByKategoribunga", query = "SELECT t FROM Tokobunga_1 t WHERE t.kategoribunga = :kategoribunga"),
    @NamedQuery(name = "Tokobunga_1.findByDeskripsiproduk", query = "SELECT t FROM Tokobunga_1 t WHERE t.deskripsiproduk = :deskripsiproduk"),
    @NamedQuery(name = "Tokobunga_1.findByHarga", query = "SELECT t FROM Tokobunga_1 t WHERE t.harga = :harga"),
    @NamedQuery(name = "Tokobunga_1.findByStok", query = "SELECT t FROM Tokobunga_1 t WHERE t.stok = :stok"),
    @NamedQuery(name = "Tokobunga_1.findByUkuran", query = "SELECT t FROM Tokobunga_1 t WHERE t.ukuran = :ukuran")})
public class Tokobunga_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idbunga")
    private String idbunga;
    @Column(name = "namabunga")
    private String namabunga;
    @Column(name = "kategoribunga")
    private String kategoribunga;
    @Column(name = "deskripsiproduk")
    private String deskripsiproduk;
    @Column(name = "harga")
    private Integer harga;
    @Column(name = "stok")
    private Integer stok;
    @Column(name = "ukuran")
    private String ukuran;
    @OneToMany(mappedBy = "idbunga")
    private Collection<Transaksitokobunga> transaksitokobungaCollection;

    public Tokobunga_1() {
    }

    public Tokobunga_1(String idbunga) {
        this.idbunga = idbunga;
    }

    public String getIdbunga() {
        return idbunga;
    }

    public void setIdbunga(String idbunga) {
        this.idbunga = idbunga;
    }

    public String getNamabunga() {
        return namabunga;
    }

    public void setNamabunga(String namabunga) {
        this.namabunga = namabunga;
    }

    public String getKategoribunga() {
        return kategoribunga;
    }

    public void setKategoribunga(String kategoribunga) {
        this.kategoribunga = kategoribunga;
    }

    public String getDeskripsiproduk() {
        return deskripsiproduk;
    }

    public void setDeskripsiproduk(String deskripsiproduk) {
        this.deskripsiproduk = deskripsiproduk;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public Collection<Transaksitokobunga> getTransaksitokobungaCollection() {
        return transaksitokobungaCollection;
    }

    public void setTransaksitokobungaCollection(Collection<Transaksitokobunga> transaksitokobungaCollection) {
        this.transaksitokobungaCollection = transaksitokobungaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbunga != null ? idbunga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tokobunga_1)) {
            return false;
        }
        Tokobunga_1 other = (Tokobunga_1) object;
        if ((this.idbunga == null && other.idbunga != null) || (this.idbunga != null && !this.idbunga.equals(other.idbunga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idbunga;
    }

}
