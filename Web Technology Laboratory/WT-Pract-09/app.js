var app = angular.module("myApp", []);

app.controller("myCtrl", function($scope) {

  $scope.registerUser = function() {
    var user = {
      firstName: $scope.firstName,
      lastName: $scope.lastName,
      username: $scope.username,
      password: $scope.password
    };

    localStorage.setItem($scope.username, JSON.stringify(user));

    $scope.firstName = "";
    $scope.lastName = "";
    $scope.username = "";
    $scope.password = "";

    $scope.successMessage = "Registration successful!";
  };

  $scope.loginUser = function() {
    var user = JSON.parse(localStorage.getItem($scope.username));
    if (user && user.password === $scope.password) {

      $scope.username = "";
      $scope.password = "";
      $scope.successMessage = "Login successful!";
    } else {
      $scope.errorMessage = "Invalid username or password";
    }
  };

});
