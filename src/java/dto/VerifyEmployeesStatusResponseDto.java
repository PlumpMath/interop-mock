package dto;

import java.io.Serializable;
import java.util.List;

public class VerifyEmployeesStatusResponseDto implements Serializable {
    public static class TestResultDto {
        private String name;
        private String status;
        private String comment;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
        
        
    }
    
    public static class ResultDto {
        private String document;
        private List<TestResultDto> tests;

        public String getDocument() {
            return document;
        }

        public void setDocument(String document) {
            this.document = document;
        }

        public List<TestResultDto> getTests() {
            return tests;
        }

        public void setTests(List<TestResultDto> tests) {
            this.tests = tests;
        }
    }
    
    private List<ResultDto> results;

    public List<ResultDto> getResults() {
        return results;
    }

    public void setResults(List<ResultDto> results) {
        this.results = results;
    }
}
