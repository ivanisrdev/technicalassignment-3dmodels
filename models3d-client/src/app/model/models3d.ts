export class Models3d {

  private _id: number;
  private _name: string;
  private _path: string;
  private _createAt: Date;
  private _updateAt: Date;

  constructor(name: string, path: string, createAt: Date, updateAt: Date) {
    this._name = name;
    this._path = path;
    this._createAt = createAt;
    this._updateAt = updateAt;
  }

  get id(): number {
    return this._id;
  }

  set id(value: number) {
    this._id = value;
  }

  get name(): string {
    return this._name;
  }

  set name(value: string) {
    this._name = value;
  }

  get path(): string {
    return this._path;
  }

  set path(value: string) {
    this._path = value;
  }

  get createAt(): Date {
    return this._createAt;
  }

  set createAt(value: Date) {
    this._createAt = value;
  }

  get updateAt(): Date {
    return this._updateAt;
  }

  set updateAt(value: Date) {
    this._updateAt = value;
  }

}
