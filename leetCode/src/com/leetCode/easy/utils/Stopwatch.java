package com.leetCode.easy.utils;

import java.util.concurrent.TimeUnit;

public class Stopwatch {
   private long startTime;
   private long stopTime;
   private boolean isStarted;

   public void start() {
       if (isStarted) {
           throw new IllegalStateException("Stopwatch is already started");
       }
       startTime = System.currentTimeMillis();
       isStarted = true;
   }

   public void stop() {
       if (!isStarted) {
           throw new IllegalStateException("Stopwatch is not started");
       }
       stopTime = System.currentTimeMillis();
       isStarted = false;
   }

   public long getElapsedTime(TimeUnit unit) {
       if (isStarted) {
           throw new IllegalStateException("Stopwatch is still running");
       }
       // 如果stopTime为0，则表示stop方法未调用，返回当前时间与startTime的差值
       if (stopTime == 0) {
           return unit.convert(System.currentTimeMillis() - startTime, TimeUnit.MILLISECONDS);
       }
       else {
           // 否则返回stopTime与startTime的差值
           return unit.convert(stopTime - startTime, TimeUnit.MILLISECONDS);
       }
   }

   public long getElapsedTime() {
       return getElapsedTime(TimeUnit.MILLISECONDS);
   }
}
