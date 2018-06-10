FROM openjdk

COPY . ./
RUN ./gradlew build && rm -rf ~/.gradle ./.gradle

EXPOSE 8080

CMD java -jar ./build/libs/app.jar
