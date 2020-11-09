# Simple TCP Client-Server
This application is a bare-bones example of creating a TCP Client-Server that allows for simple back and forth communication.

# Usage
Make a list of all source files:

`/main/src$ file -name "*.java" > sources.txt`

Compile:

`/main/src$ javac @sources.txt`

Launch ServerDriver:

`/main/src$ java server/TServerDriver`

In a separate console, launch ClientDriver:

`/main/src$ java client/TClientDriver`

Enter your message in the client console.

# Notes

`/main/src/common/Defaults` contains default values for `host` and `port` values used by the `TClientDriver` and `TServerDriver`.