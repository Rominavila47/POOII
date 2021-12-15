package POOII;

class Persona{

    //Declaro los atributos que va a usar la clase
    String nombre;
    String apellido;
    int edad;
    String hobbie;
    String editorFav;
    String usaOS;

//setters individuales, sea el caso que lo necesite. Para el caso, solo los coloco como comentario.
//    public void setNombre(String newNombre){
//        this.nombre=newNombre;
//    }
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
//    public void setEdad(int edad) {
//        this.edad = edad;
//    }
//    public void setHobbie(String hobbie) {
//        this.hobbie = hobbie;
//    }
//    public void setUsaOS(String usaOS) {
//        this.usaOS = usaOS;
//    }
//    public void setEditorFav(String editorFav) {
//        this.editorFav = editorFav;
//    }

    //declaro un setter general

    public void setAll(String[] array){

        this.nombre=array[0];
        this.apellido=array[1];
        this.edad=Integer.parseInt(array[2]);
        this.hobbie=array[3];
        this.editorFav=array[4];
        this.usaOS=array[5];
    }

    //declaro getters

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getHobbie(){
        return hobbie;
    }
    public String getEditorFav(){
        return editorFav;
    }
    public String getUsaOS(){return usaOS;}
    public String getEdad(){
        return Integer.toString(edad);
    }
    //Declaro métodos

    public void getAll(){
        String texto= "Hola! "+getApellido()+", "+getNombre()+"\n";
        String texto2= "Tu edad es: " + getEdad()+"\n";
        String texto3="Tu hobbie es: "+getHobbie()+"\n";
        String texto4="Tu editor de codigo favorito es: " +getEditorFav()+" y usas el siguiente Sistema Operativo: "+getUsaOS()+"\n";
        System.out.println(texto+texto2+texto3+texto4);
    }
}


