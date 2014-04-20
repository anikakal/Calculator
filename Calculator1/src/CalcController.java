import javax.swing.JTextField;
 
 
public class CalcController {
 
 private JTextField  ditString = null;
 
 private static CalcController instance = null;
 
 private CalcModel  calcModel;
 
 public static CalcController getInstance() {
  if (instance==null) {
   instance = new CalcController();
  }
  return instance;
 }
 
 public void setTextComponent(JTextField textComponent) {
  this.ditString = textComponent;
 }
 
 public CalcController()
 {
  calcModel = new CalcModel();
 }
 
 public void SetNumberText(String num)
 {
  String lastDit = this.ditString.getText();
  if ((lastDit.equals("")) && (num.equals("."))){num = "";}
  this.ditString.setText(lastDit+num);
 }
 
 public void ClearNumberText()
 {
  this.ditString.setText("");
 }
 
 public void SetNegativeSign()
 {
  String lastDit = this.ditString.getText();
  this.ditString.setText("-"+lastDit);
 }
 
 public void SetOperation(int operationCode)
 {
  calcModel.setOperationCode(operationCode);
  if (calcModel.getErrorCode() == -1)
  calcModel.setFirstNum(Double.parseDouble(this.ditString.getText()));
  this.ditString.setText("");
 }
 
 public void GetResult()
 {
  String resultString = "";
  double result = 0;
  calcModel.setSecondNumber(Double.parseDouble(this.ditString.getText()));
  result = calcModel.GetResult();
  if (calcModel.getErrorCode() == 0) resultString = "Деление на ноль невозможно!";
  else resultString = String.valueOf(result);
  this.ditString.setText(resultString);
 }
 
}
 
