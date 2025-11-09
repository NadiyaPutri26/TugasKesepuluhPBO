package TokoBunga;

import TokoBunga.Tokobunga_1;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-08T23:46:59", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Transaksitokobunga.class)
public class Transaksitokobunga_ { 

    public static volatile SingularAttribute<Transaksitokobunga, String> idtransaksi;
    public static volatile SingularAttribute<Transaksitokobunga, Integer> jumlah;
    public static volatile SingularAttribute<Transaksitokobunga, Tokobunga_1> idbunga;
    public static volatile SingularAttribute<Transaksitokobunga, Integer> totalharga;
    public static volatile SingularAttribute<Transaksitokobunga, String> namapelanggan;
    public static volatile SingularAttribute<Transaksitokobunga, Date> tanggal;

}