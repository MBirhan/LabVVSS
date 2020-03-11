import 'package:first_laboratory/domain/TShirt.dart';
import 'package:first_laboratory/repository/TShirtRepository.dart';

class TShirtService{

  static final TShirtService _service = TShirtService._internal();


  int _id=0;
  TShirtRepository repository;

  factory TShirtService(){
    return _service;
  }

  TShirtService._internal(){
    repository = TShirtRepository();
  }


  void addTShirt(TShirt t){
    repository.addTShirt(t);
  }


  void deleteTShirt(int id){
    repository.deleteTShirt(id);
  }

  void editTShirt(int id, TShirt t){
    repository.editTShirt(id, t);
  }

  TShirt getTShirt(int id){
    return repository.getTShirt(id);
  }

  List<TShirt> getTShirts(){
    return repository.getTShirts();
  }

  int getId(){
    return _id++;
  }

  void removeAt(int index){
    repository.removeAt(index);
  }

  void insertAt(int index, TShirt t){
    repository.insertAt(index, t);
  }

  int count(){
    return repository.count();
  }

  void clear(){
    repository.clear();
  }
}