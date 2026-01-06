int num = 121;
int original = num;
int rev = 0;

while (num != 0) {
    rev = rev * 10 + num % 10;
    num /= 10;
}

if (original == rev)
    System.out.println("Palindrome");
else
    System.out.println("Not Palindrome");
