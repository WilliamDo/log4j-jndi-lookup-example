# log4j-jndi-lookup-example

This is an example to demonstrate the use of the log4j [JNDI Lookup](https://logging.apache.org/log4j/2.x/manual/lookups.html) - the feature that caused the [log4shell](https://www.cve.org/CVERecord?id=CVE-2021-44228) vulnerability.

It uses an RMI registry as the remote server to perform the JDNI lookup against.

### Why did I use an RMI registry for lookup?
Most examples use an LDAP server, but I found it was taking too much effort to setup since all I needed was to understand what the JNDI lookup was doing. The RMI registry is part of the Java SDK and doesn't need any additional dependencies to setup.