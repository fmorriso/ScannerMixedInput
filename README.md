# ScannerMixedInput
Java is notorious for being difficult when it comes to reading a mix of text and numbers from the keyboard (System.in) using a single instance of a Scanner object.

This project shows one possible work-around: use two different scanners, one for reading text and another for reading numbers.

Whenever text (String) input is needed from the keyboard, we use the scanner designated for only reading Strings.

Whenver a number (int, double) input is needed from the keyboard, we use the scanner designated for only reading numbers.
