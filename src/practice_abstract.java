abstract  class practice_abstract {
        public practice_abstract(){
            System.out.println("i am a constructor");
        }

        public void sayHello(){
            System.out.println("hello");
        }
        abstract public void greet();
    }
     class Child extends practice_abstract {

         @Override
        public void greet() {
            System.out.println("good morning");
        }
    }

