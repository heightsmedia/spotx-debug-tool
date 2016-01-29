# spotx-pinger

## Usage

Install http://leiningen.org/

### Build

```
lein uberjar
```

### Run

With default url

```
java -jar target/spotx-pinger-1.0-standalone.jar
```

Or with custom one

```
java -jar target/spotx-pinger-1.0-standalone.jar $CUSTOM_URL
```

Useful options to fetch HTTP trace with e.g. Charles:

```
java -Dhttp.proxyHost=localhost -Dhttp.proxyPort=8888 -jar target/spotx-pinger-1.0-standalone.jar
```



