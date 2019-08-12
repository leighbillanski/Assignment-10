package za.ac.cput.Service;

public interface IService <TYPE ,ID> {
    TYPE create(TYPE type);
    TYPE read(ID id);
}
