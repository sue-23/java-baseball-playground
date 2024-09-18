## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
---
## 숫자 야구 게임 요구사항에 따른 기능 정리

- **랜덤 숫자 생성**:
    - 중복되지 않는 3개의 숫자 생성 (숫자가 중복되지 않게 하는 로직 추가 가능)
- **입력 받기**:
    - 입력받는 로직과, 입력이 유효한지 검증하는 로직을 분리 (숫자만 입력했는지, 범위는 맞는지 등)
- **게임 로직 (스트라이크/볼/낫싱)**:
    - 숫자가 정확한 자리에 있는 경우: 스트라이크
    - 숫자는 맞지만 다른 경우: 볼
    - 아예 없는 숫자인 경우: 낫싱, 포볼
- **게임 종료/재시작**:
    - 종료 조건 체크 (3 스트라이크가 나왔을 때)
    - 재시작 여부를 묻고 다시 랜덤 숫자를 생성하거나 종료
---