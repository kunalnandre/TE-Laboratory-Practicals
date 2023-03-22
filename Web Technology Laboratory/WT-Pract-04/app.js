let result = document.getElementById("result");
function calculate(value) {
  if (value === "sqrt") {
  result.value = Math.sqrt(result.value);
  } else if (value === "C") {
  result.value = "";
  } else if (value === "=") {
  result.value = eval(result.value);
  } else {
  result.value += value;
  }
  }
  function clearResult() {
  result.value = "";
  }
  function getResult() {
  try {
  result.value = eval(result.value);
  } catch (error) {
  alert("Invalid Input!");
  result.value = "";
  }
  }
