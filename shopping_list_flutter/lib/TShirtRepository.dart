import 'package:first_laboratory/domain/TShirt.dart';

class TShirtRepository{

  List<TShirt> _tshirts;

  static final _repository = TShirtRepository._internal();

  TShirtRepository._internal(){
    this._tshirts=new List<TShirt>();

    _tshirts.add(TShirt(-1, "Metallica", "Black", "M", 150, "Ron"));
    _tshirts.add(TShirt(-2, "Dirty Shirt", "Green", "L", 60, "Ron"));
    _tshirts.add(TShirt(-3, "Nirvana", "White", "M", 10, "Euro"));
    _tshirts.add(TShirt(-4, "Guns'n'Roses", "Grey", "M", 100, "Ron"));
    _tshirts.add(TShirt(-5, "Aerosmith", "Black", "M", 20, "Dollar"));
    _tshirts.add(TShirt(-6, "AC/DC", "Grey", "M", 80, "Ron"));
    _tshirts.add(TShirt(-7, "Green Day", "Black", "M", 40, "Euro"));
  }

  factory TShirtRepository(){
    return _repository;
  }

  void addTShirt(TShirt t){
    _tshirts.add(t);
  }

  List<TShirt> getTShirts(){
    return _tshirts;
  }

  TShirt getTShirt(int id){
    return _tshirts.firstWhere((elem)=>elem.id==id);
  }

  void deleteTShirt(int id){
    _tshirts.removeWhere((elem)=>elem.id==id);
  }

  void editTShirt(int id, TShirt newTShirt){
    int index =_tshirts.indexOf(newTShirt);
    deleteTShirt(id);
    _tshirts.insert(index, newTShirt);
  }

  void removeAt(int index){
    _tshirts.removeAt(index);
  }

  void insertAt(int index, TShirt t){
    _tshirts.insert(index, t);
  }

  int count(){
    return _tshirts.length;
  }

  void clear(){
    _tshirts=new List();
  }
}