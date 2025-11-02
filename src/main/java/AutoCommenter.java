//import java.io.*;
//import java.nio.file.*;
//import java.util.List;
// 더이상 사용하지 않음.
//public class AutoCommenter {
//    public static void main(String[] args) {
//        // 소스 파일 경로 설정 (자신의 소스 파일 경로로 변경하세요)
//        String filePath = "C:\\Users\\JOYOUNGJAE\\IdeaProjects\\test_prj\\test\\src\\main\\java\\Main.java";
//        try {
//            // 소스 파일을 한 줄씩 읽기
//            List<String> lines = Files.readAllLines(Paths.get(filePath));
//
//            StringBuilder newContent = new StringBuilder();
//            StringBuilder commentedCode = new StringBuilder();
//            boolean isInMainMethod = false;
//            int braceCount = 0;
//
//            for (String line : lines) {
//                if (line.contains("public static void main")) {
//                    isInMainMethod = true;
//                }
//
//                if (isInMainMethod && line.contains("{")) {
//                    braceCount++;
//                    newContent.append(line).append("\n");
//                    newContent.append("        // 여기에 작성\n");
//                    continue;
//                }
//
//                if (isInMainMethod && line.contains("}")) {
//                    braceCount--;
//                    if (braceCount == 0) {
//                        isInMainMethod = false;
//                        newContent.append(line).append("\n");
//                        continue;
//                    }
//                }
//
//                if (isInMainMethod && braceCount > 0) {
//                    // 메소드 내부 내용 주석 처리
//                    if (!line.trim().isEmpty()) { // 빈 줄은 주석 처리하지 않음
//                        commentedCode.append("    //").append(line.trim()).append("\n");
//                    }
//                } else {
//                    newContent.append(line).append("\n");
//                }
//            }
//
//            // 기존 코드 블록을 클래스 안에 주석 처리하여 추가
//            if (commentedCode.length() > 0) {
//                newContent.append("\n/*\n");
//                newContent.append(commentedCode.toString());
//                newContent.append("*/\n");
//            }
//
//            // 파일에 새로운 내용 쓰기
//            Files.write(Paths.get(filePath), newContent.toString().getBytes());
//            System.out.println("코드가 성공적으로 주석 처리되고 업데이트되었습니다.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}