package TokoBunga;

import TokoBunga.Transaksitokobunga;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-08T23:46:59", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Tokobunga_1.class)
public class Tokobunga_1_ { 

    public static volatile SingularAttribute<Tokobunga_1, String> ukuran;
    public static volatile SingularAttribute<Tokobunga_1, String> idbunga;
    public static volatile SingularAttribute<Tokobunga_1, Integer> harga;
    public static volatile CollectionAttribute<Tokobunga_1, Transaksitokobunga> transaksitokobungaCollection;
    public static volatile SingularAttribute<Tokobunga_1, String> kategoribunga;
    public static volatile SingularAttribute<Tokobunga_1, String> deskripsiproduk;
    public static volatile SingularAttribute<Tokobunga_1, Integer> stok;
    public static volatile SingularAttribute<Tokobunga_1, String> namabunga;

}