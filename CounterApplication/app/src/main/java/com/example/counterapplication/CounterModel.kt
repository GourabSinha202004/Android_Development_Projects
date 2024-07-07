package com.example.counterapplication

data class CounterModel(var count :Int)

class CounterRepository{
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun incCounter(){
        _counter.count++
    }

    fun decCounter(){
        _counter.count--
    }
}