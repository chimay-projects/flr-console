FROM registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift

COPY . ./
RUN ./gradlew build && rm -rf ~/.gradle ./.gradle

EXPOSE 8080

CMD java -jar ./build/libs/flr-console-boot.jar
