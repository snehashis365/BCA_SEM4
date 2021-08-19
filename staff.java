public class staff {
    //Implement heirarcy of staff
    //Each staff member has a code
    //Teacher inheirits from staff
    //Each teacher has a subject and publication
    //Typist inheirits from staff
    //Each typist has a speed
    //Regular inheirits from typist
    //Casual inheirits from typist
    //Each casual has a Daily
    //Office inheirits from staff
    //Each officer has a grade
    int code;
    staff(int code){
        this.code = code;
    }
}
class teacher extends staff{
    int subject;
    int publication;
    teacher(int code, int subject, int publication){
        super(code);
        this.subject = subject;
        this.publication = publication;
    }
}
class typist extends staff{
    int speed;
    typist(int code, int speed){
        super(code);
        this.speed = speed;
    }
}
class regular extends typist{
    regular(int code, int speed){
        super(code, speed);
    }
}
class casual extends typist{
    int daily;
    casual(int code, int speed, int daily){
        super(code, speed);
        this.daily = daily;
    }
}
class officer extends staff{
    int grade;
    officer(int code, int grade){
        super(code);
        this.grade = grade;
    }
}

