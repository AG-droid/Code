

app.controller('Ctrl', function($scope){

    $scope.names = [
        {name:'Jane', country:'USA'},
        {name:'Gustav', country:'Sweden'},
        {name:'Rakesh', country:'India'}
    ]
    $scope.orderbyMe = function(x){
        $scope.Myorderby = x
    }
})