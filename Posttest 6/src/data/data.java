package data;

public abstract class data<type1, type2> extends dataInput {

    private static final String menu = """
            \n> Menu :
                1. Tambah Data
                2. Lihat Data
                3. Ubah data
                4. Hapus Data
                5. Kembali
                Masukan Pilihan :""";

    protected abstract boolean Check();

    protected abstract void Create(type2 data);

    protected abstract void Read();

    protected abstract void Update(type2 data);

    protected abstract void Delete(type1 data);

    public final int Menu() {
        return Input(menu, 0);
    }
}
