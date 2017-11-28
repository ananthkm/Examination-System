create table UserDetails(userid int,username text,password text,firstname text,lastname text,emailid text,mobileno bigint,age int,prim
ary key(userid));

create table Exam(eid int,name text,difficulty enum('Easy','Medium','Hard'),passmark int,starttime time,endtime  time,primary key(eid));

create table Question(qid int,mid int,question text,difficulty enum('Easy','Medium','hard'),category text,answer text,primary key(qid));

create table Choices(qid int,Choice text,foreign key(qid) references Question(qid));

create table Material(mid int,Text text);

create table Register(userid int,eid int,foreign key(userid) references UserDetails(userid),foreign key(eid) references Exam(eid));

create table ExamQuestions(eid int,qid int,foreign key(eid) references Exam(eid),foreign key(qid) references Question(qid));

create table Result(userid int,eid int,score int,foreign key(userid) references UserDetails(userid),foreign key(eid) references Exam(eid));

create table AnswerDatabase(eid int,qid int,userid int,uanswer text,answer text,foreign key(eid) references Exam(eid),foreign key(qid) references Question(qid),foreign key(userid) references UserDetails(userid));

