package may_30;

public class Student {
    String fio;
    int age;
    long id;
    int knowledgeLevel;
    int energyLevel;

    Student (){

   }
   Student (String fioParam){
       fio = fioParam;
   }
    Student (String fioParam, int ageParam){
       fio = fioParam;
       age = ageParam;
    }
    Student (String fioParam, int ageParam, int idParam){
       fio = fioParam;
       age = ageParam;
       id = idParam;
   }
    Student (int idParam, int knowledgeLevelParam, int energyLevelParam){
       id = idParam;
       knowledgeLevel = knowledgeLevelParam;
       energyLevel = energyLevelParam;

    }


}
