package za.ac.cput.Repository;

public interface IReposetory<T,ID> {
    T create(T t);
    T read(ID id);
}
