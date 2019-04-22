#include <iostream>
using namespace std;
int main(){
  // Declaración de variables
  float suma=0, horas;
  float precioHora=3.5;//Dado por la empresa
  char  cont;
   cout<<" \n\n Empresa la Universal\n";
   for (cont=0;cont<5;cont++){
     cout<<"Ingrese el Numero de horas trabajadas para el dia";
     cin>>horas;
     suma=suma+horas;
   }
   cout<<"\n\n El resultado de Horas trabajadas es: "<<suma;
   cout<<"\n\n El sueldo a recibir es: $ "<<suma*precioHora;
   return 0;
   
   
}
