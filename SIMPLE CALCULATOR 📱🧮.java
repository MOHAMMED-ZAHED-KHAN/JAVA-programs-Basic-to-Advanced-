Scanner scanner = new Scanner(System.in);

      double num1 ; 
      double num2 ; 
      char operator ; 
      double result = 0 ; 

      System.out.print("Enter the num1 value: ");
      num1 = scanner.nextDouble();

      System.out.print("Enter the num2 value: ");
      num2 = scanner.nextDouble();

      System.out.print("Enter the operator (+,-,*,/,^): ");
      operator = scanner.next().charAt(0);

      switch(operator){
        case '+' -> result = num1 + num2 ;
        case '-' -> result = num1 - num2 ;
        case '*' -> result = num1 * num2 ;
        case '/' -> result = num1 / num2 ;
        case '^' -> result = Math.pow(num1 , num2);
      }

      System.out.println(result);



      scanner.close();
