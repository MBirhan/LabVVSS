import 'package:first_laboratory/addedit.dart';
import 'package:first_laboratory/domain/TShirt.dart';
import 'package:first_laboratory/service/TShirtService.dart';
import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'MetalHead Flutter',
      theme: ThemeData(

        primarySwatch: Colors.green,
      ),
      home: MyHomePage(title: 'MetalHead'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);


  final String title;

  @override
  MyHomePageState createState() => MyHomePageState();

}

class MyHomePageState extends State<MyHomePage> {
  TShirtService service = TShirtService();

  void deleteItem(int index) {
    setState(() {
      service.removeAt(index);
    });
  }

  void addItem() {
    Navigator.push(context, MaterialPageRoute(
        builder: (context) => AddEdit(TShirt(-8, "Band", "Color", "Size", 0, "Currency"), false)))
        .then((t) =>
        setState(() {
          if(t!=null)
            service.addTShirt(t);
        }));
  }

  void editItem(int index) {
    setState(() {
      Navigator.push(context, MaterialPageRoute(
          builder: (context) => AddEdit(service.getTShirts()[index], true)))
          .then((t) => {
        if(t != null){
          service.removeAt(index),
          service.insertAt(index, t)
        }
      });
    });
  }

  @override
  Widget build(BuildContext context) {


    print(service.getTShirts());
    return Scaffold(
      appBar: AppBar(

        title: Text(widget.title),
      ),
      body: ListView.builder(
        itemCount: service.count(),
        itemBuilder: (BuildContext context, int index) =>
            ListTile(title: Text(service.getTShirts()[index].toString()), onTap: () {
              editItem(index);
            },trailing: IconButton(icon: Icon(Icons.delete),onPressed: (){
              deleteItem(index);
            },),),

      ),
      floatingActionButton: FloatingActionButton(
        onPressed: addItem,
        tooltip: 'Add',
        child: Icon(Icons.add),
      ),
    );
  }
}
