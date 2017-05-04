# intellij-gradle-jacoco
Sample Project to expose IntelliJ bug which prevents Gradle-generated JaCoCo coverage from being properly displayed.

## Setup
1. Set IntelliJ to _Delegate IDE build/run actions to gradle_ in _File_->_Settings_->_Build, Execution, Deployment_->_Build Tools_->_Gradle_->_Runner_.

## Instructions
1. Build->Rebuild Project
2. Analyze->Show Coverage Data
3. Add project-b/build/jacoco/test.exec

Expected result: Coverage > 0%
Actual result: Coverage = 0%

## Analysis
Project A and Project C have duplicate classes (by name and package, not by contents). Project B does not depend on either Project A or Project C. After showing the coverage execution data for only Project B, the IntelliJ logs show an error in trying to run the analysis against the duplicate classes. This seems like an unnecessary failure given that the coverage data does not include any references to those classes.