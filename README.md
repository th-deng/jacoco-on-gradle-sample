# jacoco-on-gradle-sample

The sample project of [Gradle 프로젝트에 JaCoCo 설정하기](http://woowabros.github.io/experience/2020/02/02/jacoco-config-on-gradle-project.html)
from [우아한 형제들 기술 블로그](http://woowabros.github.io/)


# Run tests and generate JaCoCo report

`test` task를 실행하면 `jacocoTestReport` task가 따라서 실행된다.

```bash
$ ./gradlew clean test
$ ./gradlew clean test jacocoTestReport jacocoTestCoverageVerification
```

`jacocoTestCoverageVerification` task에서 실패되는 것을 볼 수 있고, 정상이다. 테스트 커버리지를 올려서 `jacocoTestCoverageVerification` task를 통과시키자.
