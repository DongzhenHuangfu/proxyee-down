package lee.study.down.form;

import lombok.Data;

@Data
public class DownForm {
  private String id;
  private String fileName;
  private String path;
  private int connections;
}
