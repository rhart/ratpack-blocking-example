A Ratpack example showing the consequences of writing blocking code on the main thread.

Included is a JMeter test that sends 100 concurrent requests to 2 different handlers.  Each handler's code sleeps for 10 seconds but one is blocking and the other is not.  Run the test and see what the results are for yourself.
