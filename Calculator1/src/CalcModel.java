public class CalcModel {
 
 private double firstNum = 0;
 
 private double secondNumber = 0;
 
 private int operationCode = 0;
 
 private int errorCode = -1;
 
 public void setFirstNum(double firstNum) {
  this.firstNum = firstNum;
 }
 
 public void setSecondNumber(double secondNumber) {
  this.secondNumber = secondNumber;
 }
 
 public void setOperationCode(int operationCode) {
  this.operationCode = operationCode;
 }
 
 public int getErrorCode() {
  return errorCode;
 }
 
 private double Summ()
 {
  errorCode = -1;
  return firstNum + secondNumber;
 }
 
 private double Sub()
 {
  errorCode = -1;
  return firstNum - secondNumber;
 }
 
 private double Mul()
 {
  errorCode = -1;
  return firstNum * secondNumber;
 }
 
 private double Div()
 {
  if (this.secondNumber != 0)
  {
   return firstNum / secondNumber;
  }
  else
  {
   errorCode = 0;
   return 0;
  }
 }
 
 public double GetResult()
 {
  double result = 0;
  switch (this.operationCode) {
  case 0:
   result = Summ();
   break;
  case 1:
   result = Sub();
   break;
  case 2:
   result = Mul();
   break;
  case 3:
   result = Div();
   break; 
  default:
   result = 0;
   break;
  }
 
  return result;
 }
}
