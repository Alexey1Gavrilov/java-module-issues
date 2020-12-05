package com.alexey1gavrilov.javamodule.promethues;

import io.prometheus.client.Counter;
import io.prometheus.client.exporter.MetricsServlet;
import io.prometheus.client.exporter.PushGateway;

public class Test {
  public static void main(String[] args) {
    System.out.println(Counter.class.getName());
    System.out.println(PushGateway.class.getName());
    System.out.println(MetricsServlet.class.getName());
  }
}
