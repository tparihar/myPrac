var app = angular.module("myApp", []);

app.controller("myController", [ '$scope', function($scope) {
	$scope.count = 0;
	$scope.a = "vishal";
	$scope.b = "singh";
	$scope.emp = [ {
		fname : "Thakur",
		lname : "Parihar",
		mname : "Vishal singh"
	}, {
		fname : "V",
		lname : "Rao",
		mname : "Akshay"
	}, {
		fname : "Dada",
		lname : "Sagar",
		mname : "Thapa"
	} ];

	$scope.demo = [ {
		name : "C#",
		likes : 0,
		Dislikes : 0,
	}, {
		name : "ASP.NET",
		likes : 0,
		Dislikes : 0,
	}, {
		name : "SQL",
		likes : 0,
		Dislikes : 0,
	}, {
		name : "ANGULAR JS",
		likes : 0,
		Dislikes : 0,
	} ];
	$scope.c = function() {
		return $scope.a + " " + $scope.b
	}
} ]);